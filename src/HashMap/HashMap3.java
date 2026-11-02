package HashMap;
import java.util.*;

public class HashMap3 {

    // 🔹 Custom HashMap using Generics (K = key type, V = value type)
    static class HashMap<K, V> {

        // 🔹 Node represents a key-value pair stored in a bucket (LinkedList)
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        // 🔹 n = total number of elements (size of map)
        private int n;

        // 🔹 N = number of buckets (array size)
        private int N;

        // 🔹 Array of LinkedLists (each index = bucket)
        // Used for handling collisions (separate chaining)
        private LinkedList<Node> buckets[];

        // 🔹 Constructor → initialize buckets
        public HashMap() {
            this.N = 4; // initial capacity
            this.buckets = new LinkedList[N];

            // Initialize each bucket with empty LinkedList
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // 🔹 Hash Function → converts key into bucket index
        private int hashFunction(K key) {
            int hc = key.hashCode();     // built-in hash
            return Math.abs(hc) % N;     // map to valid index
        }

        // 🔹 Search for key inside a bucket (LinkedList)
        // Returns index of node inside LinkedList (di = data index)
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                // 🔥 IMPORTANT: use equals() for object comparison
                if (node.key.equals(key)) {
                    return i; // found at index i
                }
            }
            return -1; // not found
        }

        // 🔹 Rehashing → increase capacity when load factor is high
        public void rehash() {

            // Store old buckets
            LinkedList<Node>[] oldBuck = buckets;

            // Double bucket size
            N = 2 * N;

            // Create new bucket array
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Reset size before reinserting
            n = 0;

            // Reinsert all nodes into new buckets
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];

                for (Node node : ll) {
                    put(node.key, node.value); // rehash each element
                }
            }
        }

        // 🔹 PUT → Insert new key or update existing key
        public void put(K key, V value) {

            int bi = hashFunction(key);       // bucket index
            int di = searchInLL(key, bi);     // data index

            if (di != -1) {
                // 🔥 Key already exists → update value
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                // 🔥 Key not present → insert new node
                buckets[bi].add(new Node(key, value));
                n++; // increase size
            }

            // 🔹 Check load factor
            double lambda = (double) n / N;

            // 🔥 If too many elements → resize
            if (lambda > 2.0) {
                rehash();
            }
        }

        // 🔹 Check if key exists
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        // 🔹 GET → Retrieve value for key
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                return buckets[bi].get(di).value;
            } else {
                return null;
            }
        }

        // 🔹 REMOVE → Delete key-value pair
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node removed = buckets[bi].remove(di);
                n--; // decrease size
                return removed.value;
            } else {
                return null;
            }
        }

        // 🔹 Return all keys
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            // Traverse all buckets
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];

                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // 🔹 Check if map is empty
        public boolean isEmpty() {
            return n == 0;
        }
    }

    // 🔹 Driver code
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        System.out.println(hm.get("India"));     // 100
        System.out.println(hm.containsKey("USA")); // true

        hm.remove("China");
        System.out.println(hm.get("China"));     // null

        System.out.println(hm.keySet());         // [India, USA]
    }
}

/*
======================== HASHMAP NOTES (REVISION) ========================

🔹 WHAT IS THIS IMPLEMENTATION?
Custom implementation of HashMap using:
→ Array of LinkedLists (Separate Chaining)
→ Generics (K = Key, V = Value)

--------------------------------------------------------------------------

🔹 CORE IDEA
HashMap = Array + Hash Function + Collision Handling

1. Key → hashCode()
2. hashCode → bucket index (bi)
3. Store data in LinkedList at that index

--------------------------------------------------------------------------

🔹 IMPORTANT VARIABLES

n → number of key-value pairs (size of map)
N → number of buckets (array size)
lambda (load factor) = n / N

--------------------------------------------------------------------------

🔹 HASH FUNCTION

int bi = Math.abs(key.hashCode()) % N;

→ Converts key into valid array index
→ Ensures uniform distribution

--------------------------------------------------------------------------

🔹 COLLISION HANDLING

Multiple keys can map to same index → COLLISION

Solution:
→ Use LinkedList at each bucket
→ Store multiple nodes in same index

--------------------------------------------------------------------------

🔹 SEARCH IN LINKED LIST

Linear search inside bucket:
→ Compare using equals() (NOT ==)

if(node.key.equals(key))

--------------------------------------------------------------------------

🔹 PUT OPERATION

1. Find bucket index (bi)
2. Search key in that bucket
3. If found → update value
4. Else → insert new node
5. Increase size (n++)

--------------------------------------------------------------------------

🔹 GET OPERATION

1. Find bucket index
2. Search in LinkedList
3. If found → return value
4. Else → return null

--------------------------------------------------------------------------

🔹 REMOVE OPERATION

1. Find bucket index
2. Search key
3. Remove node from LinkedList
4. Decrease size (n--)

--------------------------------------------------------------------------

🔹 CONTAINS KEY

→ Just check if key exists using search

--------------------------------------------------------------------------

🔹 REHASHING (VERY IMPORTANT)

When load factor increases:
lambda = n / N

If lambda > 2.0:
→ Double bucket size (N = 2 * N)
→ Create new array
→ Reinsert all elements

WHY?
→ To maintain O(1) performance

--------------------------------------------------------------------------

🔹 TIME COMPLEXITY

Average Case:
put() → O(1)
get() → O(1)
remove() → O(1)

Worst Case:
→ O(n) (if all keys go to same bucket)

--------------------------------------------------------------------------

🔹 CRITICAL POINTS (INTERVIEW)

1. Always use equals() for key comparison
2. hashCode() is used for hashing
3. Collision handled using LinkedList
4. Rehashing improves performance
5. Load factor controls resizing

--------------------------------------------------------------------------

🔹 LIMITATIONS OF THIS IMPLEMENTATION

❌ No tree-based optimization (Java 8 uses Red-Black Tree)
❌ Basic hash function
❌ No thread safety

--------------------------------------------------------------------------

🔹 INTERVIEW ONE-LINER

"HashMap uses an array of buckets where each bucket is a linked list.
Keys are hashed to indices, collisions are handled via chaining,
and rehashing is done when load factor increases."

=========================================================================

*/
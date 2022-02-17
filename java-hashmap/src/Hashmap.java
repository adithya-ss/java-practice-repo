import java.util.HashMap;

class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> companies = new HashMap<String, String>();
        // Adding key-value pairs.
        companies.put("Apple", "Steve Jobs/Steve Wozniak");
        companies.put("Microsoft", "Bill Gates");
        companies.put("Google", "Larry Page/Sergey Brin");
        companies.put("Meta/Facebook", "Mark Zuckerberg");
        companies.put("Amazon", "Jeff Bezoz");
        companies.put("Alibaba", "Jack Ma");

        // Displaying hashmaps as how dictionaries would be in python.
        System.out.println("Size of hashmap: " + companies.size());
        System.out.println(companies);

        // Useful functions.
        System.out.println("Removing Amazon from hashmap...");
        companies.remove("Amazon");
        System.out.println("Size of hashmap: " + companies.size());
        System.out.println(companies);
        System.out.println("Founder(s) of Apple: " + companies.get("Apple"));
        // Clear hashmap - companies.clear()
        // Replace a value for a specific key: companies.replace("key_name","new_value");
        System.out.println(companies.containsKey("Salesforce"));
        System.out.println(companies.containsKey("Google"));
        for (String key : companies.keySet()) {
            System.out.print(key + " : ");
            System.out.println(companies.get(key));
        }
    }
}

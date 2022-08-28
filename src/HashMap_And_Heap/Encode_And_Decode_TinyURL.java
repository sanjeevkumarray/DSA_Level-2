package HashMap_And_Heap;
import  java.util.* ;
public class Encode_And_Decode_TinyURL {

    //  535. Encode and Decode TinyURL
    public class Codec {

        HashMap<String,String> map = new HashMap<>();
        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            StringBuilder sb = new StringBuilder();
            sb.append((char) (Math.floor(Math.random()*100)));
            while(map.containsKey(sb.toString())){
                sb.append((char)Math.floor(Math.random()*100));
            }
            map.put(sb.toString(),longUrl);
            return sb.toString();
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(shortUrl);
        }
    }

}

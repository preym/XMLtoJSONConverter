import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author naveen.k
 */
public class XMLtoJsonConverter {
    private URL url = null;
    private InputStream inputStream = null;

    public void getXMLfromJson() {
        try {
            String xml = "<itemfeed>\n" +
                    "<type>Trending</type>\n" +
                    "<items>\n" +
                    "<item>\n" +
                    "<itemType>Collection</itemType>\n" +
                    "<itemCategory>Makeup Looks</itemCategory>\n" +
                    "<name>Smoky Look I Love</name>\n" +
                    "<images>\n" +
                    "<primaryImage>\n" +
                    "<![CDATA[\n" +
                    "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJkAAAAkCAMAAACt1mgjAAAAOVBMVEUAAAB7e3t3d3dycnJubm5tbW1qampoaGhiYmJcXFxVVVVOTk5GRkY9PT0yMjInJycbGxsODg4AAADO/Nq/AAAAEnRSTlMAHzxXa3B/h5yvwM/c5+/2+/67fu+4AAAD7UlEQVR42u2Xi47EJgxFL1CXtzH8/8dWOGHZzMy+Gm0rVb0azQTHsU8cAxk42jI4paM1cOuUpXeyWKItt2x2u3xloivAFo93ah4qHVw8Jmca79XzGediLBZYrglLH5u2HrJsslPla7KN4TD1aLxP1mtKi2wrfZ9siFbtkdfeI7MhtzH4zNuYuZ+Bzedkjaf6w210Zm6r7PfIYHxifZrbEjVf+JyMoLJNMRcZH8aqlD8jS7gqjs6JzFve7Zm/RQa7fBaZSubA3SFbhbySkSb5HhmeyLbvLTJKqptk/RfI4CtzefU00/fIojb7A5nRTrU/IuP0JnuUp3MbfCELCuQ/JytJxerirmSmzGP523NTMYoYIA63Vw0eKvnBehawV429bKR7ZMxaOHpaaf33yQJUT8vvPbI8AiwP+0iW8YOa+fu703OfmX5wXMlYqb/us8wHxYsd3QC4NzdNTIlW3vjwEvL13HRdB8u57beg22SZQc3tvKpHsj2wD2SoFzLGRfd2pwI3unlN1neDwy3MTbaj/gIZNwBl0Gsy3u84Zm3d/xRZ1fXsI7JwvrUSZdHD+GOyq9LHJuGtDMBPyxC8JkN7XKN+jWxrhfFtjGo/InP9aY3aZLus+RfIVJY+IoMp7/wtnslIkf0vkaWx/7M9yUZuYzAn92Z5/udnz4Pls12vsl+aHv8V4n/9t5SFe8CzKEG1zzE3CfhMfAZ85ZbLGU9YMl6K0mXUDEy3sE47D9Bfd7iR0WyGVl7XAXe8rOhJQ0aPoWYlC/OCbs4mXoERc43qJjNmAMwRAWShA2Pn54yltxLmkQlSmmGWXIUxchFHyTQZIffseu8WwJGy9RFI6h9dBjkpjag18dM3KVn1GjAOaeCUw5BmJuLxgxTnwFKtf0qRYFrhRMIS2/CUNBYaFyYwYUoMUmRvhIxgWIRCKXaXBYxaTMv6NFmCGklAYjxVD8dUTayumMiTbAXMZDs4oGenzVJ61VIkQmAO1Caj6TEDM1xsiImSxqIKNEL2ALxlgBIbMMAYmAlTaswzm+5oq4vUSKwHblqEEsC2SjnI6iQLNncWsEVn5gD4bmstAFIAJkTWW+A0vyKDCihR0lghnTeA2WdHzQD9rJolUEUDO6S4yNRIjFmkWj2INVps9iQLFTBihg99jsWYefOxGdszMGsN1yZCPmtmhBiUNhmx1gylZQk4+myRlXr0WR0BNXvh7haZGolhRIZ3og0JMIqU7tSDW+4BvgkXBoK0ZuZlTbI4nbp18ESwZ59JfCBD1T4D7DG/HN404AzO+aZzhrA1jSoy60tlt4Ma14l1Me2dxy5Hs8JdZJNHc3ilgX9X3CXjL4yxjrobi61CAAAAAElFTkSuQmCC\n" +
                    "]]>\n" +
                    "</primaryImage>\n" +
                    "</images>\n" +
                    "<creationDetails>\n" +
                    "<creatorType>user</creatorType>\n" +
                    "<creatorName>Suyash Katyayani</creatorName>\n" +
                    "<createdOn>2 July 2014 18:46 PM</createdOn>\n" +
                    "<creatorId>646</creatorId>\n" +
                    "</creationDetails>\n" +
                    "<socialActions>\n" +
                    "<views>1344</views>\n" +
                    "<ratings>12</ratings>\n" +
                    "<loves>5</loves>\n" +
                    "<wishlist>2</wishlist>\n" +
                    "<addToCarts>89</addToCarts>\n" +
                    "<purchases>25</purchases>\n" +
                    "</socialActions>\n" +
                    "</item>\n" +
                    "<item>\n" +
                    "<itemType>Product</itemType>\n" +
                    "<itemCategory>Face Wash</itemCategory>\n" +
                    "<name>Lakme Face Wash</name>\n" +
                    "<images>\n" +
                    "<primaryImage>\n" +
                    "<![CDATA[\n" +
                    "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJkAAAAkCAMAAACt1mgjAAAAOVBMVEUAAAB7e3t3d3dycnJubm5tbW1qampoaGhiYmJcXFxVVVVOTk5GRkY9PT0yMjInJycbGxsODg4AAADO/Nq/AAAAEnRSTlMAHzxXa3B/h5yvwM/c5+/2+/67fu+4AAAD7UlEQVR42u2Xi47EJgxFL1CXtzH8/8dWOGHZzMy+Gm0rVb0azQTHsU8cAxk42jI4paM1cOuUpXeyWKItt2x2u3xloivAFo93ah4qHVw8Jmca79XzGediLBZYrglLH5u2HrJsslPla7KN4TD1aLxP1mtKi2wrfZ9siFbtkdfeI7MhtzH4zNuYuZ+Bzedkjaf6w210Zm6r7PfIYHxifZrbEjVf+JyMoLJNMRcZH8aqlD8jS7gqjs6JzFve7Zm/RQa7fBaZSubA3SFbhbySkSb5HhmeyLbvLTJKqptk/RfI4CtzefU00/fIojb7A5nRTrU/IuP0JnuUp3MbfCELCuQ/JytJxerirmSmzGP523NTMYoYIA63Vw0eKvnBehawV429bKR7ZMxaOHpaaf33yQJUT8vvPbI8AiwP+0iW8YOa+fu703OfmX5wXMlYqb/us8wHxYsd3QC4NzdNTIlW3vjwEvL13HRdB8u57beg22SZQc3tvKpHsj2wD2SoFzLGRfd2pwI3unlN1neDwy3MTbaj/gIZNwBl0Gsy3u84Zm3d/xRZ1fXsI7JwvrUSZdHD+GOyq9LHJuGtDMBPyxC8JkN7XKN+jWxrhfFtjGo/InP9aY3aZLus+RfIVJY+IoMp7/wtnslIkf0vkaWx/7M9yUZuYzAn92Z5/udnz4Pls12vsl+aHv8V4n/9t5SFe8CzKEG1zzE3CfhMfAZ85ZbLGU9YMl6K0mXUDEy3sE47D9Bfd7iR0WyGVl7XAXe8rOhJQ0aPoWYlC/OCbs4mXoERc43qJjNmAMwRAWShA2Pn54yltxLmkQlSmmGWXIUxchFHyTQZIffseu8WwJGy9RFI6h9dBjkpjag18dM3KVn1GjAOaeCUw5BmJuLxgxTnwFKtf0qRYFrhRMIS2/CUNBYaFyYwYUoMUmRvhIxgWIRCKXaXBYxaTMv6NFmCGklAYjxVD8dUTayumMiTbAXMZDs4oGenzVJ61VIkQmAO1Caj6TEDM1xsiImSxqIKNEL2ALxlgBIbMMAYmAlTaswzm+5oq4vUSKwHblqEEsC2SjnI6iQLNncWsEVn5gD4bmstAFIAJkTWW+A0vyKDCihR0lghnTeA2WdHzQD9rJolUEUDO6S4yNRIjFmkWj2INVps9iQLFTBihg99jsWYefOxGdszMGsN1yZCPmtmhBiUNhmx1gylZQk4+myRlXr0WR0BNXvh7haZGolhRIZ3og0JMIqU7tSDW+4BvgkXBoK0ZuZlTbI4nbp18ESwZ59JfCBD1T4D7DG/HN404AzO+aZzhrA1jSoy60tlt4Ma14l1Me2dxy5Hs8JdZJNHc3ilgX9X3CXjL4yxjrobi61CAAAAAElFTkSuQmCC\n" +
                    "]]>\n" +
                    "</primaryImage>\n" +
                    "</images>\n" +
                    "<creationDetails>\n" +
                    "<creatorType>brand</creatorType>\n" +
                    "<creatorName>Lakme</creatorName>\n" +
                    "<createdOn>2 July 2014 18:46 PM</createdOn>\n" +
                    "<creatorId>26</creatorId>\n" +
                    "</creationDetails>\n" +
                    "<socialActions>\n" +
                    "<views>13244</views>\n" +
                    "<ratings>72</ratings>\n" +
                    "<loves>50</loves>\n" +
                    "<wishlist>9</wishlist>\n" +
                    "<addToCarts>119</addToCarts>\n" +
                    "<purchases>17</purchases>\n" +
                    "</socialActions>\n" +
                    "</item>\n" +
                    "</items>\n" +
                    "<has_more>true</has_more>\n" +
                    "<callbackhash>135cec3t3x4ctc4tx43tc4x3t34xt3xtx</callbackhash>\n" +
                    "</itemfeed>";
            JSON objJson = new XMLSerializer().read(xml);
            System.out.println("JSON data : " + objJson);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                url = null;
            } catch (IOException ex) {
            }
        }
    }

    public static void main(String[] args) {
        new XMLtoJsonConverter().getXMLfromJson();
    }
}

package com.nacre.online_assesment.action;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.nacre.online_assesment.util.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



 class JsonUtil {

  /**
     * Prevent instantiation.
     */
    protected JsonUtil() {
    }

    /**
     * Returns a list of String objects from a JSONArray. This
     * does not do any kind of recursive unpacking of the array.
     * Thus, if the array includes other JSON arrays or JSON objects
     * their string representation will be a single item in the
     * returned list.
     *
     * @param jArray The JSONArray to convert.
     * @return A List of the String representation of each item in
     * the JSON array.
     * @throws JSONException if an element of jArray cannot be
     * converted to a String.
     */
    public static List<String> getStringListFromJsonArray(JSONArray jArray) throws JSONException {
      List<String> returnList = new ArrayList<String>();
      for (int i = 0; i < jArray.length(); i++) {
        String val = jArray.getString(i);
        returnList.add(val);
      }
      return returnList;
    }

    /**
     * Returns a Java Object list of a JSONArray with each item in
     * the array converted using convertJsonItem().
     *
     * @param jArray The JSONArray to convert.
     * @return A List of Strings and more Object lists.
     * @throws JSONException if an element in jArray cannot be
     * converted properly.
     */
    public static List<Questions> getListFromJsonArray(JSONArray jArray) throws JSONException {
      List<Questions> returnList = new ArrayList<Questions>();
      for (int i = 0; i < jArray.length(); i++) {
        returnList.add((Questions) convertJsonItem(jArray.get(i)));
      }
      return returnList;
    }

    /**
     * Returns a list containing one two item list per key in jObject.
     * Each two item list has the key String as its first element and
     * the result of calling convertJsonItem() on its value as the
     * second element. The sub-lists in the returned list will appear
     * in alphabetical order by key.
     *
     * @param jObject The JSONObject to convert.
     * @return A list of two item lists: [String key, Object value].
     * @throws JSONException if an element in jObject cannot be
     * converted properly.
     */
    @SuppressWarnings("unchecked")
  public static List<Object> getListFromJsonObject(JSONObject jObject) throws JSONException {
      List<Object> returnList = new ArrayList<Object>();
      Iterator<String> keys = jObject.keys();

      List<String> keysList = new ArrayList<String>();
      while (keys.hasNext()) {
        keysList.add(keys.next());
      }
      Collections.sort(keysList);

      for (String key : keysList) {
        List<Object> nestedList = new ArrayList<Object>();
        nestedList.add(key);
        nestedList.add(convertJsonItem(jObject.get(key)));
        returnList.add(nestedList);
      }

      return returnList;
    }

    /**
     * Returns a Java object representation of objects that are
     * encountered inside of JSON created using the org.json package.
     * JSON arrays and objects are transformed into their list
     * representations using getListFromJsonArray and
     * getListFromJsonObject respectively.
     *
     * Java Boolean values and the Strings "true" and "false" (case
     * insensitive) are inserted as Booleans. Java Numbers are
     * inserted without modification and all other values are inserted
     * as their toString(). value.
     *
     * @param o An item in a JSON array or JSON object to convert.
     * @return A Java Object representing o or the String "null"
     * if o is null.
     * @throws JSONException if o fails to parse.
     */
    public static Object convertJsonItem(Object o) throws JSONException {
      if (o == null) {
        return "null";
      }

      if (o instanceof JSONObject) {
        return getListFromJsonObject((JSONObject) o);
      }

      if (o instanceof JSONArray) {
        return getListFromJsonArray((JSONArray) o);
      }

      if (o.equals(Boolean.FALSE) || (o instanceof String &&
          ((String) o).equalsIgnoreCase("false"))) {
        return false;
      }

      if (o.equals(Boolean.TRUE) || (o instanceof String && ((String) o).equalsIgnoreCase("true"))) {
        return true;
      }

      if (o instanceof Number) {
        return o;
      }

      return o.toString();
    }

    public static String getJsonRepresentation(Object value) throws JSONException {
      if (value == null || value.equals(null)) {
        return "null";
      }
      /*
       * This has been commented out to prevent the need for the Kawa library. Do NOT use Fstring
       * or YailList in any of your data, otherwise this conversion won't work.
       * 
      if (value instanceof FString) {
        return JSONObject.quote(value.toString());
      }
      if (value instanceof YailList) {
        return ((YailList) value).toJSONString();
      }
      */
      
      if (value instanceof Number) {
        return JSONObject.numberToString((Number) value);
      }
      if (value instanceof Boolean) {
        return value.toString();
      }
      if (value.getClass().isArray()) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String separator = "";
        for (Object o: (Object[]) value) {
          sb.append(separator).append(getJsonRepresentation(o));
          separator = ",";
        }
        sb.append("]");
        return sb.toString();
      }
      if (value instanceof String) {
        return value.toString();
      }
      return JSONObject.quote(value.toString());
    }

    public static Object getObjectFromJson(String jsonString) throws JSONException {
      final Object value = (new JSONTokener(jsonString)).nextValue();
      // Note that the JSONTokener may return a value equals() to null.
      if (value == null || value.equals(null)) {
        return null;
      } else if ((value instanceof String) ||
                 (value instanceof Number) ||
                 (value instanceof Boolean)) {
        return value;
      } else if (value instanceof JSONArray) {
        return getListFromJsonArray((JSONArray)value);
      } else if (value instanceof JSONObject) {
        return getListFromJsonObject((JSONObject)value);
      }
      throw new JSONException("Invalid JSON string.");
    }
}
  
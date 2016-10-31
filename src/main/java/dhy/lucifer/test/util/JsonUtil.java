package dhy.lucifer.test.util;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

/**
 * 1.对象转换成json字符串 2.list集合转换成json字符串 3.使用泛型获取javaBean 4.使用泛型获取list列表
 * 5.使用泛型获取包含Map集合的list列表 6.使用泛型获取map集合
 * 
 * @author Administrator
 * 
 */
public class JsonUtil {

	protected static Gson gson = new Gson();

	/**
	 * 对象转换成json字符串
	 * 
	 * @param obj
	 * @return
	 */
	public static String createJsonString(Object obj) {
		String str = gson.toJson(obj);
		return str;
	}

	/**
	 * list集合转换成json字符串
	 * 
	 * @param list
	 * @return
	 */
	public static String createJsonList(List list) {
		String str = gson.toJson(list);
		return str;
	}

	/**
	 * 使用泛型获取javaBean
	 * 
	 * @param jsonString
	 * @param cls
	 * @return
	 */
	public static <T> T changeJsonToObject(String jsonString, Class<T> cls) {
		T t = null;
		try {
			t = gson.fromJson(jsonString, cls);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return t;
	}

	/**
	 * 使用泛型获取list列表
	 * 
	 * @param json
	 * @param cls
	 * @return
	 */
	public static <T> ArrayList<T> changeGsonToList(String json, Class<T> cls) {
		Type type = new TypeToken<ArrayList<JsonObject>>() {
		}.getType();
		ArrayList<JsonObject> jsonObjs = new Gson().fromJson(json, type);// 反序列化出ArrayList<JsonObject>，
		ArrayList<T> listOfT = new ArrayList<T>();
		for (JsonObject jsonObj : jsonObjs) {
			listOfT.add(new Gson().fromJson(jsonObj, cls));
		}

		return listOfT;
	}

	/**
	 * 使用泛型获取包含Map集合的list列表
	 * 
	 * @param gsonString
	 * @return
	 */
	public static <T> List<Map<String, T>> changeGsonToListMaps(
			String gsonString) {
		List<Map<String, T>> list = null;
		list = gson.fromJson(gsonString, new TypeToken<List<Map<String, T>>>() {
		}.getType());
		return list;
	}

	/**
	 * 使用泛型获取map集合
	 * 
	 * @param gsonString
	 * @return
	 */
	public static <T> Map<String, T> changeGsonToMaps(String gsonString) {
		Map<String, T> map = null;
		map = gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {
		}.getType());
		return map;
	}
}

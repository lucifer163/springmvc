package dhy.lucifer.test.util;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

/**
 * 1.����ת����json�ַ��� 2.list����ת����json�ַ��� 3.ʹ�÷��ͻ�ȡjavaBean 4.ʹ�÷��ͻ�ȡlist�б�
 * 5.ʹ�÷��ͻ�ȡ����Map���ϵ�list�б� 6.ʹ�÷��ͻ�ȡmap����
 * 
 * @author Administrator
 * 
 */
public class JsonUtil {

	protected static Gson gson = new Gson();

	/**
	 * ����ת����json�ַ���
	 * 
	 * @param obj
	 * @return
	 */
	public static String createJsonString(Object obj) {
		String str = gson.toJson(obj);
		return str;
	}

	/**
	 * list����ת����json�ַ���
	 * 
	 * @param list
	 * @return
	 */
	public static String createJsonList(List list) {
		String str = gson.toJson(list);
		return str;
	}

	/**
	 * ʹ�÷��ͻ�ȡjavaBean
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
	 * ʹ�÷��ͻ�ȡlist�б�
	 * 
	 * @param json
	 * @param cls
	 * @return
	 */
	public static <T> ArrayList<T> changeGsonToList(String json, Class<T> cls) {
		Type type = new TypeToken<ArrayList<JsonObject>>() {
		}.getType();
		ArrayList<JsonObject> jsonObjs = new Gson().fromJson(json, type);// �����л���ArrayList<JsonObject>��
		ArrayList<T> listOfT = new ArrayList<T>();
		for (JsonObject jsonObj : jsonObjs) {
			listOfT.add(new Gson().fromJson(jsonObj, cls));
		}

		return listOfT;
	}

	/**
	 * ʹ�÷��ͻ�ȡ����Map���ϵ�list�б�
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
	 * ʹ�÷��ͻ�ȡmap����
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

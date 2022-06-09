package task03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainR {
    public static void main(String[] args) {
        List<String> menus = List.of("濃厚バター醤油ポップコーン", "チキンナゲット", "ストロベリーチョコレートクレープ", "海苔塩ポップコーン");
//        List<String> result = new ArrayList<>();

//  拡張for文
        for (String menu : menus) {
            System.out.println(menu);
        }

//        for (String menu : menus) {
//            if (menu.contains("ポップコーン")) {
//                result.add(menu);
//                System.out.println(result);
//            }
//        }

//   【Streamを使って表現】
        List<String> result = menus.stream().filter(menu -> menu.contains("ポップコーン")).toList();
        System.out.println(result);

        List<String> startsResult = menus.stream().filter(menu -> menu.startsWith("チ")).toList();
        System.out.println(startsResult);

        List<String> sortedResult = menus.stream().sorted().toList();
        System.out.println(sortedResult);

        long count = menus.stream().filter(menu -> menu.contains("ス")).count();
        System.out.println(count);

        boolean チキンナゲット = menus.stream().anyMatch(menu -> menu.equals("チキンナゲット"));
        System.out.println(チキンナゲット);


//  forEach　ラムダ式
        menus.forEach(m -> System.out.println(m));

//  forEachメソッド参照　
        menus.forEach(System.out::println);

//  for文
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + " " + menus.get(i));
        }

//　拡張for文　(entrySetメソッドでMapのキーと値の両方を取得)　
//  Mapの変数名をmenusMapからmenusPriceに変更　→　変数名からkeyとvalueをイメージしやすいように!
        Map<String, String> menusPrice = new HashMap<>();
        menusPrice.put("濃厚バター醤油ポップコーン", "Sサイズ:¥350,Mサイズ:¥400,Lサイズ:¥450");
        menusPrice.put("チキンナゲット", "¥380");
        menusPrice.put("ストロベリーチョコレートクレープ", "¥450");

        for (Map.Entry<String, String> entry : menusPrice.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}

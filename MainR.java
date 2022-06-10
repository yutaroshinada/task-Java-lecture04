package task03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainR {
    public static void main(String[] args) {
        List<String> menuList = List.of("濃厚バター醤油ポップコーン", "チキンナゲット", "ストロベリーチョコレートクレープ", "海苔塩ポップコーン");
//        List<String> result = new ArrayList<>();

//  拡張for文
        for (String menu : menuList) {
            System.out.println(menu);
        }

//        for (String menu : menus) {
//            if (menu.contains("ポップコーン")) {
//                result.add(menu);
//                System.out.println(result);
//            }
//        }

//   【Streamを使って表現】
        List<String> result = menuList.stream().filter(menu -> menu.contains("ポップコーン")).toList();
        System.out.println("文字列「ポップコーン」が含まれる値を表示:" + result);

        List<String> startsResult = menuList.stream().filter(menu -> menu.startsWith("チ")).toList();
        System.out.println("「チ」で始まる値を表示:" + startsResult);

        List<String> sortedResult = menuList.stream().sorted().toList();
        System.out.println("昇順に並び替えた値を表示:" + sortedResult);

        long count = menuList.stream().filter(menu -> menu.contains("ス")).count();
        System.out.println("「ス」を含む値を表示:" + count);

        boolean チキンナゲット = menuList.stream().anyMatch(menu -> menu.equals("チキンナゲット"));
        System.out.println("文字列「チキンナゲット」を含まれているかを判定:" + チキンナゲット);


//  forEach　ラムダ式
        menuList.forEach(m -> System.out.println(m));

//  forEachメソッド参照　
        menuList.forEach(System.out::println);

//  for文
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + " " + menuList.get(i));
        }

//　拡張for文　(entrySetメソッドでMapのキーと値の両方を取得)　
//  Mapの変数名をmenusMapからmenusPriceに変更　→　変数名からkeyとvalueをイメージしやすいように!
        Map<String, String> menusPriceMap = new HashMap<>();
        menusPriceMap.put("濃厚バター醤油ポップコーン", "Sサイズ:¥350,Mサイズ:¥400,Lサイズ:¥450");
        menusPriceMap.put("チキンナゲット", "¥380");
        menusPriceMap.put("ストロベリーチョコレートクレープ", "¥450");

        for (Map.Entry<String, String> entry : menusPriceMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-----キー名と値を取得する-----");
        menusPriceMap.entrySet().stream()
                .map(menu -> menu.getKey() + " : " + menu.getValue())
                .forEach(System.out::println);

        System.out.println("-----キー名でソートする-----");
        menusPriceMap.entrySet().stream()
                .sorted(java.util.Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("-----値でソートする-----");
        menusPriceMap.entrySet().stream()
                .sorted(java.util.Map.Entry.comparingByValue())
                .forEach(System.out::println);


        System.out.println("-----Enumクラスを用いて-----");
        for (Menus menu : Menus.values()) {
            System.out.println(menu.name() + " : " + menu.getValue());
        }


    }
}

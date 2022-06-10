package task03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainR {
    public static void main(String[] args) {
        List<String> menuList = List.of("濃厚バター醤油ポップコーン", "チキンナゲット", "ストロベリーチョコレートクレープ", "海苔塩ポップコーン");
        System.out.println("-----------------------【for文】-----------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + " " + menuList.get(i));
        }
        System.out.println("------------------------ここまで-------------------------------");

        System.out.println("----------------------【拡張for文】----------------------------");

        for (String menu : menuList) {
            System.out.println(menu);
        }
        System.out.println("-------------------------ここまで--------------------------------");


        System.out.println("----------------------【Stream API】-----------------------------");

        List<String> result = menuList.stream().filter(menu -> menu.contains("ポップコーン")).toList();
        System.out.println("文字列「ポップコーン」が含まれる値を表示：" + result);

        List<String> startsResult = menuList.stream().filter(menu -> menu.startsWith("チ")).toList();
        System.out.println("「チ」で始まる値を表示：" + startsResult);

        List<String> sortedResult = menuList.stream().sorted().toList();
        System.out.println("昇順に並び替えた値を表示：" + sortedResult);

        long count = menuList.stream().filter(menu -> menu.contains("ス")).count();
        System.out.println("「ス」を含む値を表示：" + count);

        boolean チキンナゲット = menuList.stream().anyMatch(menu -> menu.equals("チキンナゲット"));
        System.out.println("文字列「チキンナゲット」が含まれているかを判定：" + チキンナゲット);

        menuList.forEach(System.out::println);

        System.out.println("-----------------------ここまで-----------------------------");

        System.out.println("-----------------------【Map】-----------------------------");

        Map<String, String> menuPriceMap = new HashMap<>();
        menuPriceMap.put("濃厚バター醤油ポップコーン", "Sサイズ:¥350,Mサイズ:¥400,Lサイズ:¥450");
        menuPriceMap.put("チキンナゲット", "¥380");
        menuPriceMap.put("ストロベリーチョコレートクレープ", "¥450");

//      ここもStreamに書き換えてみてください！
        for (Map.Entry<String, String> entry : menuPriceMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("-----------------------ここまで-----------------------------");
    }
}

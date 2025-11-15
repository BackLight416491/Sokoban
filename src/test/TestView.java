package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TestView {
    // 该类用于测试视图相关功能
    public static void main(String[] args) {
        char[][] testMap = {
            {'#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', ' ', '@', ' ', '#'},
            {'#', '■', '○', ' ', '#'},
            {'#', '#', '#', '#', '#'}
        };

        HashMap<Character, String> renderMap = new HashMap<>();
        renderMap.put('#', "# ## #");
        renderMap.put(' ', "      ");
        renderMap.put('@', "/ @@ /");
        renderMap.put('■', "■ ■■ ■");
        renderMap.put('○', "▫ ▫ ▫ ▫");

        for(char[] row:testMap){
            for(char cell:row){
                System.out.print(renderMap.get(cell).substring(0, 3));
            }
            System.out.println();
            for(char cell:row){
                System.out.print(renderMap.get(cell).substring(3));
            }
            System.out.println();
        }
    }
}
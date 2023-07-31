package com.example.kiosk

fun main() {
    val menus: MutableMap<String, List<Menu>> = mutableMapOf()
    val menuItems: MutableMap<String, List<Item>> = mutableMapOf()

    val mainMenus: MutableList<Menu> = ArrayList()
    mainMenus.add(Menu("BURGERS", "버거"))
    mainMenus.add(Menu("SIDES", "사이드"))
    mainMenus.add(Menu("DRINKS", "음료"))

    val orderMenus: MutableList<Menu> = java.util.ArrayList()
    orderMenus.add(Menu("Order", "장바구니를 확인 후 주문합니다."))

    val burgersMenus: MutableList<Item> = java.util.ArrayList()
    burgersMenus.add(Item("모스버거", 4.7, "토마토∙양파∙소고기 등을 넣고 끓인 85℃ 특제 미트소스와 순소고기 패티의 일품인 버거"))
    burgersMenus.add(Item("새우가츠버거", 5.1, "바삭하게 튀겨낸 탱탱한 새우의 식감이 풍부하게 느껴지는 버거"))
    burgersMenus.add(Item("와규치즈버거", 7.2, "100% 호주산 와규 패티에 멜팅 치즈, 볶은 양파, 특제 간장소스를 더한 프리미엄 버거"))

    val sideMenus: MutableList<Item> = java.util.ArrayList()
    sideMenus.add(Item("프랜치 프라이", 2.9, "두툼함이 특징인 감자튀김"))
    sideMenus.add(Item("어니언링", 3.5, "촉촉하고 부드러운 통양파튀김"))
    sideMenus.add(Item("버터플라이 쉬림프", 5.4, "통 새우 한 마리를 꼬리까지 그대로, 바삭함 한입! 고소함 또 한입!"))

    val drinkMenus: MutableList<Item> = java.util.ArrayList()
    drinkMenus.add(Item("콜라", 2.9, "코카콜라"))
    drinkMenus.add(Item("메론 소다", 2.9, "모스버거 시그니쳐 음료!"))
    drinkMenus.add(Item("제주 한라봉 소다", 3.9, "제주도 특산과일 한라봉을 이용한 상큼한 과일소다"))

    menus.put("Main", mainMenus)
    menus.put("Order", orderMenus)

    menuItems.put("BUGERS", burgersMenus)
    menuItems.put("SIDES", sideMenus)
    menuItems.put("DRINKS", drinkMenus)

    menuItems.forEach{(k, v) ->
        println(" [ $k Menu ]")
        val maxLength = v.maxOf{it.name.length}  // 가장 긴 name의 길이 계산 -> 메뉴를 깔끔하게 정렬

        for ((index, item) in v.withIndex()) {
            val itemName = item.name.padEnd(maxLength)  // padEnd(lenth, padChar)로 문자열 길이를 맞춤 -> 메뉴판 깔끔하게 정렬
            println("${index+1}. ${itemName} | ${item.price} | ${item.description}")
            //println("${index+1}. ${item.name} | ${item.price} | ${item.description}")
        }
        println("")
    }
}
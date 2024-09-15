使用方法

1.到此專案底下(看到src目錄)執行 mvn clean package
第二步執行各程式所需參數如下

Sorting


2.進入target目錄 下 java -cp P20240913-0.0.1-SNAPSHOT.jar com.systex.main.Sorting ${SORTING}  
這個${SORTING} 當輸入 0 為升冪排序， 若為1 則為降冪排序，範例如下
java -cp P20240913-0.0.1-SNAPSHOT.jar com.systex.main.Sorting 0   //為升冪
java -cp P20240913-0.0.1-SNAPSHOT.jar com.systex.main.Sorting 1   //為降冪

Lottery

2.進入target目錄 下 java -cp P20240913-0.0.1-SNAPSHOT.jar com.systex.main.Lottery ${Lottery1} ${Lottery2}  
這個${Lottery1} 為您要排除的樂透號碼，每個數字用","隔開，第二組用"空白"隔開，範例如下
java -cp P20240913-0.0.1-SNAPSHOT.jar com.systex.main.Lottery 1,5,12,33,41,49 4,11,17,23,29,45
代表輸入第一組樂透為 1 5 12 33 41 49 ，第二組為 4 11 17 23 29 45
只能輸入兩組號碼且各有六個號碼




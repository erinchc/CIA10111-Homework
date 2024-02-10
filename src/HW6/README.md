## 題目

請設計三個類別Calculator.java, CalException.java與CalTest.java
1. **Calculator.java** :  
   有個自訂方法為powerXY(int x, int y), 功能是會計算x的y次方並回傳結果。

2. **CalTest.java** :  
   使用者可以輸入x與y的值。

3. **CalException.java** :  
   例外處理機制,讓程式能解決以下狀況:
   - x與y同時為0, 產生自訂的CalException例外物件  
   - y為負值,而導致x的y次方結果不為整數  
   - x與y皆正確情況下,會顯示運算後結果



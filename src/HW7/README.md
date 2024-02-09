## 題目

### 建立父類別Pen
- 兩個屬性：品牌(brand)、價格(price) **(封裝設計)**
- 建構子設計：一個無參數與一個根據屬性而設計
- 定義Getter/Setter方法
- 宣告一個抽象方法write()

### 建立兩個子類別Pencil與InkBrush **(繼承)**
- 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
- Pencil實際售價為定價8折，InkBrush為定價9折
- 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額 **(多型)**

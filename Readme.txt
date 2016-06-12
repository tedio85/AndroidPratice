Server部分:
  Main:產生新的JFrame
  Server:Extends JFrame,並且利用ConnectionThread接受連線，並且將收到的訊息顯示在JLabel，再加到JFrame上

Client部分:
  MainActivity:在計算完答案之後，產生新的thread，並且利用setStrToSend設定要傳輸的String
  ip_page.xml:輸入ip畫面時的頁面

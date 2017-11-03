public class IntStack{
  private int max ;//スタックの容量
  private int ptr;//スタックのポインタ
  private int[] stk;//スタックの本体

//実行時例外：スタックが空
//スタックが空のときptrが0になる
public clas EmptyIntStackException extends RuntimeException{
public EmptyIntStackException(){ }
}

//実行時例外:スタックが満杯
//スタックが満杯のときptrがmaxと同じ値になる
public class OverflowIntStackException extends RuntimeException{
  public OverflowIntStackException(){ }
}

//コンストラクタ
//コンストラクタはスタックを生成するときなどの準備処理を行う
//ただし，生成時のスタックは空であるのでスタックポインタptr
//の値を0にする．そして，仮引capacityから受け取ったスタック容量
//をmaxにコピーして要素数がmaxである配列stkの本体を作成する
public IntStack(int capacity){
  ptr=0;
  max=capacity;
  try{
    stk=new int[max];
  }catch(OutOfMemoryError e){
    max=0;
  }
}

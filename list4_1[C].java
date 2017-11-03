//スタックからデータをポップ(頂上のデータを取り出す)してその値を返すメソッド
//スタックがからでポップできない場合は例外EmptyIntStackExceptionをスローする
public int pop() throws EmptyIntStackException{
  if(ptr<=0)
  throw new EmptyIntStackException();
  //まずスタックポインタptrの値を一つ減らしてからstk[ptr]に
  //格納されている値を返す
  return stk[--ptr];
}

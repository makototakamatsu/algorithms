//スタックにxをプッシュ
public int push(int x) throws OverflowIntStackException{
//スタックが満杯でプッシュできないとき例外OverflowIntStackException
//を使う
  if(ptr>= max)
  throw new OverflowIntStackException();
  //return文によって返却されるのは,
  //xが代入された後のstk[ptr]の値
  return stk[ptr++]=x;
}

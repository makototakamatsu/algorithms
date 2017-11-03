//スタックからxを探してインデックスを返す//
public int indexof(int x){
  for (int i = ptr - 1; i>=0;i--)
  if(stk[i]==x)
  return i;
  return -1
}
//スタックをからにする//

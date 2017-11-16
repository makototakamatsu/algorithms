//配列の要素a[idx1]とa[idx2]の値を交換//
static void swap(int[] a, int idx1, int idx2){
int t=a[idx1];
a[idx1]=a[idx2];
a[idx2]=t;
}

//DownHeap//
//配列a中のa[left]~a[right]の要素をヒープ化するメソッド
//a[left]を下流の適切な位置まで下す働き
static void downHeap(int[] a, int left,int right){
int temp=a[left];//根
int child;//大きいほうの子供
int parent;//親

for (parent=left;parent<(right+1)/2;parent=child){
int cl=parent*2+1;//右の子供
int cr=cl+1;//左の子供

//もし条件節にあっていればcrに代入,条件節にあっていなければclに代入
//条件節と代入が合わさってる
//三項演算子//<条件式>?<真式>:<偽式>;//
//条件式child = (cr<= right && a[cr]>a[cl])
//真式cr
//偽式cl
child = (cr<= right && a[cr]>a[cl]) ? cr:cl;
if(temp >= a[child])
break;
a[parent]=a[child];
}
a[parent]=temp;
}

///HeapSort//
static void heapSort(int[] a, int n){
for(int i =(n-1)/2;i>=0;i--)//a[i]~a[n-1]をヒープ化
downHeap(a,i,n-1);

for(int i = n-1;i>0;i--){
swap(a,0,i);//最大要素と未ソート部末尾要素を交換
downHeap(a,0,i-1);//a[0]~a[i-1]をヒープ化
}
}

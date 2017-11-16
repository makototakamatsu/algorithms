//�z��̗v�fa[idx1]��a[idx2]�̒l������//
static void swap(int[] a, int idx1, int idx2){
int t=a[idx1];
a[idx1]=a[idx2];
a[idx2]=t;
}

//DownHeap//
//�z��a����a[left]~a[right]�̗v�f���q�[�v�����郁�\�b�h
//a[left]�������̓K�؂Ȉʒu�܂ŉ�������
static void downHeap(int[] a, int left,int right){
int temp=a[left];//��
int child;//�傫���ق��̎q��
int parent;//�e

for (parent=left;parent<(right+1)/2;parent=child){
int cl=parent*2+1;//�E�̎q��
int cr=cl+1;//���̎q��

//���������߂ɂ����Ă����cr�ɑ��,�����߂ɂ����Ă��Ȃ����cl�ɑ��
//�����߂Ƒ�������킳���Ă�
//�O�����Z�q//<������>?<�^��>:<�U��>;//
//������child = (cr<= right && a[cr]>a[cl])
//�^��cr
//�U��cl
child = (cr<= right && a[cr]>a[cl]) ? cr:cl;
if(temp >= a[child])
break;
a[parent]=a[child];
}
a[parent]=temp;
}

///HeapSort//
static void heapSort(int[] a, int n){
for(int i =(n-1)/2;i>=0;i--)//a[i]~a[n-1]���q�[�v��
downHeap(a,i,n-1);

for(int i = n-1;i>0;i--){
swap(a,0,i);//�ő�v�f�Ɩ��\�[�g�������v�f������
downHeap(a,0,i-1);//a[0]~a[i-1]���q�[�v��
}
}

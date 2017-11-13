
# coding: utf-8

# In[2]:

#バブルソート
def bubble_sort(array):
    n=len(array)
    for i in range(n-1):
        #n-1からiまで-1ずつ探索
        for j in range(n-1, i, -1):
            #j-1に格納されている数がjに格納されている数より
            #大きいとき交換
            if array[j] < array[j-1]:
                tmp=array[j]
                array[j]=array[j-1]
                array[j-1]=tmp
                
#デバック
if __name__=="__main__":
    array=[7,22,5,11,32,120,68,70]
    print("before",array)
    bubble_sort(array)
    print("after",array)


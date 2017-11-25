
# coding: utf-8

# In[5]:

def insert(val,heap,counter):
    i=counter
    while((i!=1)and(heap[i/2]<val)):
        heap[i]=heap[i/2]
        i=i/2
    heap[i]=val



# coding: utf-8

# In[11]:

class Stack:
    def __init__(self, stack = None,max = 100):
        self.max = max
        if type(stack) is type([]):
            self.stack = stack
        elif stack is None:
            self.stack = []
        else:
            print('Please list type!\n')

    def push(self, e):
        if not self.is_full():
            self.stack.append(e)    
            return self.stack
        else:
            print('Stack is full!!\n')      

    def pop(self):
        if not self.is_empty():
            e = self.stack.pop()
            return (e, self.stack)
        else:
            print('Stack is empty!!\n')  


    def is_empty(self):
        if len(self.stack) is 0:
            return True
        else:
            return False

    def is_full(self):
        if len(self.stack) is self.max:
            return True
        else:
            return False  


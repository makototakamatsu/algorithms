
 a=[5,4,3,2,1];
x0=0.5
function nes(x)
   y=a[0]
    for i in 1:5
        y=y*x+a[i]
    return y
    end
end

nes(x0)

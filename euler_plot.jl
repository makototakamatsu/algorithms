
C1=C2=D1=D2=1.0
u0=v0=0.5
t=0.05

function euler(u,v)
    u_new=(1+t*D1-t*C1*v)*u
    v_new=(1-t*D2+t*C2*u)*v
    u,v=u_new,v_new
    return u,v
end

euler(u0,v0)

u,v=u0,v0
uv_sq=[u0,v0]

for i in 1:500
    u,v=euler(u,v)
    uv_sq=hcat(uv_sq,[u,v])
end

uv_sq

using Plots
gr()

plot(uv_sq')

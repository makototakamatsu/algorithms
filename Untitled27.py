
# coding: utf-8

# 出力
def output_line(buff, n):
    s = n
    while s >= 0 and buff[s] != '\n': s -= 1
    e = buff.find('\n', n)
    print(buff[s+1:e])
    return e + 1

# 探索
def bf_search(buff, pattern):
    n = len(buff) - 1
    m = len(pattern)
    i = 0
    while i <= n - m:
        j = 0
        while j < m:
            if buff[i + j] != pattern[j]: break
            j += 1
        if j == m:
            # 発見
            i = output_line(buff, i)
        else:
            i += 1






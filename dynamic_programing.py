
def comb(n, r):
    if r == 0 or n == r:
        return 1
    else:
        return comb(n - 1, r) + comb(n - 1, r - 1)

if __name__ == '__main__':
    s = time.clock()
    print comb(22, 11)
    print time.clock() - s
    s = time.clock()
    print comb(24, 12)
    print time.clock() - s
    s = time.clock()
    print comb(26, 13)
    print time.clock() - s

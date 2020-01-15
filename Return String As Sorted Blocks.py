# -*- coding: utf-8 -*-
"""
Created on Fri Jan 10 17:02:43 2020

@author: Kari Ness
"""

def representsInt(s):
    try:
        int(s)
        return True
    except ValueError:
        return False

def inList(s,ch):
    if s == []:
        s.append(ch)
    elif s != []:
        index = 0
        var = 0
        for i in s:
            if not ch in i:
                s[index] += ch
                var = 1
                break
            index += 1
        if var == 0:
            s.append(ch)

def blocks(s):
    s_n = []
    s_c = []
    s_C = []
    for ch in s:
        if representsInt(ch):
            inList(s_n,ch)
        elif ch.isalpha():
            if ch.islower():
                inList(s_c,ch)
            else:
                inList(s_C,ch)
        else:
            raise Exception('the string should only contain numbers or letters')
    
    s_n2 = []
    s_c2 = []
    s_C2 = []
    
    s_n3 = ''
    s_c3 = ''
    s_C3 = ''
    
    for i in s_n:
        s_n2.append(''.join(sorted(i, key = int)))
    s_n3 += '-'.join(s_n2)
    
    for j in s_c:
        s_c2.append(''.join(sorted(j)))
    s_c3 += '-'.join(s_c2)
    
    for k in s_C:
        s_C2.append(''.join(sorted(k)))
    s_C3 += '-'.join(s_C)
        
#    if len(s_n2) > len(s_c2) and len(s_n2) > len(s_C2):
#        index = 0
#        for l in s_n2:
#            if len(s):
#            final2.append(s)
            
    final = s_c3 + s_C3 + s_n3
    print(final)
    return final

def main():
    blocks("21AxBz")
    blocks("abacad")
    blocks("")

main()
    
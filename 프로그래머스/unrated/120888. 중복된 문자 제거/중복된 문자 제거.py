def solution(my_string):
    li = []
    l = ""
    for i in my_string:
        li.append(i) if i not in li else 0
    for j in li:
        l += "" + j
    return l
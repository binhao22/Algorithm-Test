def solution(my_string):
    answer = my_string.lower()  
    s = "".join(sorted(answer))
    return s
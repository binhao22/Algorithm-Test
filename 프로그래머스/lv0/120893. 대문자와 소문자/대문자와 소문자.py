def solution(my_string):
    tmp = 0
    answer = ""
    for i in my_string:
        if ord(i) > 96:
            answer += my_string[tmp].upper()
        else:
            answer += my_string[tmp].lower()
        tmp += 1
    return answer
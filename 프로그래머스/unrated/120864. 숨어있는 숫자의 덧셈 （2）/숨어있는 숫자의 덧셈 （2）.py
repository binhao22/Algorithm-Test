def solution(my_string):
    answer = 0
    tmp = ""
    for i in my_string:
        if i.isdigit():
            tmp += i
        else:
            tmp += "*"
    digit = tmp.split("*")
    for j in digit:
        answer += int(j) if j != "" else 0
    return answer
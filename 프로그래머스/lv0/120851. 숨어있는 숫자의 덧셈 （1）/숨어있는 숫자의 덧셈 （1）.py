def solution(my_string):
    answer = 0
    num = ['1', '2', '3', '4', '5', '6', '7', '8', '9']
    for i in my_string:
        answer += int(i) if i in num else 0
    return answer
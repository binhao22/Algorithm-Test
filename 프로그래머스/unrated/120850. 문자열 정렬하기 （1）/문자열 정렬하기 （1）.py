def solution(my_string):
    answer = []
    for i in my_string:
        answer.append(int(i)) if ord(i) < 65 else 0
    answer.sort()
    return answer
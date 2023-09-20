def solution(my_string):
    answer = ''
    no = ['a', 'e', 'i', 'o', 'u']
    for i in my_string:
        if i not in no:
            answer += i
    return answer
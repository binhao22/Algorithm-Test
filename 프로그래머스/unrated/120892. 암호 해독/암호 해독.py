def solution(cipher, code):
    flag = 1
    answer = ''
    for i in cipher: 
        answer += i if flag % code == 0 else ''
        flag += 1
    return answer
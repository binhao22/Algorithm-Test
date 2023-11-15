def solution(s):
    answer = 0
    idx = 0
    # split 으로 문자열에서 하나씩 추출
    news = s.split(" ")
    for i in news:
        if i == 'Z':
            answer -= int(news[idx-1])
        else:
            answer += int(i)
        idx += 1
    return answer
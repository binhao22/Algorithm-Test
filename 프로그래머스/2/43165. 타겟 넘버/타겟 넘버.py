def solution(numbers, target):
    answer = 0
    n = len(numbers)
    def dfs(idx, result):
        if idx == n:
            if target == result:
                nonlocal answer
                answer += 1
        else:
            dfs(idx + 1, result + numbers[idx])
            dfs(idx + 1, result - numbers[idx])
    dfs(0, 0)
    return answer
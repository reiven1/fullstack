#!/bin/bash
# auto_push_5min_win.sh
# 윈도우 환경(Git Bash/WSL)에서 매 5분 정각 0초에만 변경 확인 → 자동 커밋 + 푸시

# Git 경고 방지: core.autocrlf false 권장
# git config --global core.autocrlf false
# 나중에 필요하면 true로 변경

while true; do
    # 현재 분과 초
    min=$(date +%M)
    sec=$(date +%S)

    # 다음 5분 정각 0초까지 대기
    sleep_sec=$(( (5 - 10#$min % 5) * 60 - 10#$sec ))
    if [ $sleep_sec -lt 0 ]; then
        sleep_sec=$((sleep_sec + 300))
    fi
    sleep $sleep_sec

    # 변경 사항 스테이징
    git add -A

    # 변경 사항이 있으면 커밋 & 푸시
    if ! git diff-index --quiet HEAD --; then
        git commit -m "Auto save $(date +'%Y-%m-%d %H:%M:%S')"
        git push origin main
        echo "Changes pushed at $(date +'%H:%M:%S')"
    else
        echo "No changes at $(date +'%H:%M:%S')"
    fi
done

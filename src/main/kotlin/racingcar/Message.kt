package racingcar

enum class Message(val message: String) {
    INPUT_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_GAME_ROUND("시도할 횟수는 몇 회인가요?")
}
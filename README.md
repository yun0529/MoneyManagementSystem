# MoneyManagementSystem

2022-03-17(2차시-실습)
  특정 값(exit)이 들어오기 전까지 무한반복하기 위해 while문을 사용하여 6(=exit)이 입력되기 전까지 반복시킵니다.
  
  각 메뉴에 따른 번호를 입력받고, switch ~ case 문을 사용하여 각 case별로 함수를 작동시키도록 하였습니다.
  1. 돈을 추가하는 addMoney()에서는 받은 돈의 이름, 금액을 입력합니다.
  2. 사용한 돈을 입력하는 Spending()에서는 사용한 돈의 이름, 금액을 입력합니다.
  3. 사용한돈, 받은돈을 수정하는 editMoney()에서는 먼저 Delete(delete)할지 Edit(edit)할지를 입력한 후 switch ~ case문을 사용하여 각각 다른 코드를 실행시킵니다.
  Delete(delete)일때는 삭제할 돈의 명칭을 작성합니다. Edit(edit)에서는 수정할돈의 명칭, 수정할 돈의 값을 입력합니다.
  4. 모든 내역을 보여주는 viewMoney()에서는 받거나 사용한 돈의 내역을 모두 출력합니다.

2022-03-24(3차시-실습)
  메서드를 만들고 각각의 매뉴에서 할 일을 메서드 안에서 진행시켜라.
   - 저번주에 이미 메서드를 만들고 입력한 메뉴 번호에 따라 각각의 메서드가 진행 되도록 하여 따로 추가된 메서드는 없습니다.
   -  2번 메뉴의 이름을 Spending에서 spendMoney로 변경 하였습니다.
   -  선택한 매뉴에 따라 메서드를 실행 시키는 switch~case문에 default가 없어 추가하였습니다.
  1. addMoney
    - 받은 돈의 출처와 금액을 Scanner 클래스를 사용하여 입력합니다.
  2. spendMoney
    - 사용한 돈의 출처와 금액을 Scanner 클래스를 사용하여 입력합니다.
  3. editMoney
    - 먼저 Scanner 클래스를 사용하여 수정 할 것인지, 삭제 할 것인지를 next()메서드를 사용하여 입력받습니다.
    - 수정에서는 수정할 돈의 출처와 금액을 입력받습니다.
    - 삭제에서는 삭제할 돈의 출처를 입력받습니다.
  4. viewMoney
    - addMoney()와 spendMoney에서 입력한 기록들을 출력해줍니다.
  5. Show a menu
    - 메뉴를 보여주는것인데 따로 메서드를 만들지 않아도 되어 구현하지 않았습니다.
  6. Exit
    - 프로그램을 끝내는 메뉴인데 while반복문에서 6이 입력되면 반복을 멈추게 하였기 때문에 따로 메서드를 구현하지 않았습니다.

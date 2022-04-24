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

2022-03-31(4차시-실습)
  기존코드에서 수정된 내용
   - spendMoney() 메서드를 addMoney() 메서드로 통합하였습니다.
   - 원래 돈의 이름과 금액을 입력받았었다면 이제는 돈의 분류(사용, 입금)을 입력한 후 이름과 금액을 입력해야 합니다.
   - editMoney() 메서드에서 delete와 edit을 실행 했었는데 deleteMoney() 메서드를 추가하여 삭제를 실행할 수 있도록 하였습니다.
   - 데이터를 따로 관리하는 Money 클래스의를 type으로 한 링크드리스트를 사용하여 보다 돈의 관리를 편하게 할 수 있도록 하였습니다.
  MenuManager 클래스
   - MenuManager 클래스의 메서드들을 모두 MoneyManager 클래스로 옮겼습니다.
   - MoneyManager 클래스의 인스턴스를 만들고 생성자에 Scanner의 객체를 넣어줍니다.
   - 각각의 메뉴를 선택했을 때 MoneyManager의 인스턴스를 통해 MoneyManager에 포함 되어있는 메서드를 사용합니다.
  Money 클래스
   - Money의 데이터를 저장하는 클래스로 생성자를 통해 돈의 분류, 사용한돈, 받은돈 등을 입력받아 저장합니다.
   - Money 클래스의 printLog 메서드는 저장되어있는 데이터들을 출력하는 역할을 합니다.
  MoneyManager 클래스
   - Money 클래스의 인스턴스 money를 생성하고 생성자에는 이름에는 null과 금액에는 0을 전달해줍니다.
   - 컬랙션클래스를 상속받는 Money형 링크드리스트의 인스턴스를 생성합니다.
   - Scanner 클래스의 객체를 생성하고 생성자에 전달받은 객체를 MoneyManager에서 생성한 객체에 넣어줍니다. -> 새롭게 데이터를 할당하지 않아도 됨
   - addMoney() 메서드에서는 입금된 돈의 분류, 이름, 금액을 입력하여 money에 저장합니다.
   - deletemoney() 메서드에서는 돈의 이름을 입력받아 리스트에 있는지 확인하고 찾으면 삭제, 찾지 못하면 이름을 찾지 못했다고 출력합니다.
   - editMoney() 메서드에서는 돈의 이름을 입력받아 리스트에 있는지 확인하고 찾으면 수정할 금액을 입력받고 수정, 찾지 못하면 이름을 찾지 못했다고 출력합니다.
   - viewMoney() 메서드에서는 Money 클래스의 내역을 출력하는 printLog() 메서드를 사용하여 입력, 삭제, 수정한 최종 내역을 출력합니다.

2022-04-24(5차시-실습)
  기존코드에서 수정된 내용
   - 메뉴 및 log를 출력하는 메소드의 이름을 viewMoneys로 변경
   - MoneyManager 클래스에서 진행했던 addMoney 메소드를 각각의 클래스에서 수행할 수 있도록 하였음
   - SavingMoney,LoanMoney 클래스를 만들고 Money 클래스를 상속하게 하였음
   - enum 형 클래스인 MoneyKind 클래스를 만들고 돈의 입,출금 내역을 입력하기 전 어떤 유형으로 입,출금 할것인지 정할 수 있도록 하였음 
   - Money 클래스의 맴버변수들은 캡슐화 하여 getter, setter 메소드로 접근할 수 있도록 하였음
   - Money 패키지를 하나 추가하여 Money 클래스와 이를 상속하는 클래스를 나눠주었음
  MoneyManager 클래스
   - addMoney 메소드에서 돈의 분류를 입력받아 case별로 어떻게 실행할지 나눠주었음
   - viewMoneys 메소드에서 내역을 출력하기전 내역의 갯수를 출력하고 내역 출력이후 현재 갖고있는 총 금액을 출력하도록 하였음
  Money 클래스
   - MoneyKind 클래스의 kind라는 인스턴스를 선언하고 기본적으로 입,출금이 될 수 있도록 Checking_Account로 초기화 하였음
   - kind에 대한 getter, setter 메소드를 추가하였음
   - MoneyManager의 addMoney매소드에서 내용을 가져와 Money클래스에서 getKindInput 메소드에서 입,출금에 대한 기능을 수행하도록 하였음
   - getKindInput 메소드의 기능은 기본적으로 addMoney 메소드에서 했던 기능과 동일하며 처음 분류를 입력하라는 메시지에 어떤 분류를 입력해야하는지 (add / spend)로 표시
   - getKindInput 메소드의 반환형을 boolean으로 한 것은 Money 클래스를 상속받는 클래스에서 boolean 값을 반환해야 하기에 그렇게 설정 하였음
  MoneyKind 클래스
   - 금액의 유형을 Checking_Account(입,출금), Saving_Account(적금), Loan(대출) 으로 나눌 수 있도록 선언
  SavingMoney 클래스
   - Money 클래스를 상속받는 클래스
   - MoneyManager의 addMoney매소드에서 내용을 가져와 Money클래스에서 getKindInput 메소드에서 적금에 대한 기능을 수행하도록 하였음
   - getKindInput 메소드의 기능은 기본적으로 addMoney 메소드에서 했던 기능과 동일
   - 처음 분류를 입력하라는 메시지에 어떤 분류를 입력해야하는지 (deposit)으로 표시
   - 입금을 할지 말지에 대해 확인하는 answer라는 변수 추가
   - 'y'또는 'Y' 입력시 금액의 이름과 액수를 입력받음 'n'또는 'N' 입력시 금액을 입력받지 않고 메뉴로 돌아감 
  LoanMoney 클래스
   - Money 클래스를 상속받는 클래스
   - MoneyManager의 addMoney매소드에서 내용을 가져와 Money클래스에서 getKindInput 메소드에서 대출에 대한 기능을 수행하도록 하였음
   - getKindInput 메소드의 기능은 기본적으로 addMoney 메소드에서 했던 기능과 동일
   - 처음 분류를 입력하라는 메시지에 어떤 분류를 입력해야하는지 (loan)으로 표시
   - 대출을 할지 말지에 대해 확인하는 answer라는 변수 추가
   - 'y'또는 'Y' 입력시 금액의 이름과 액수를 입력받음 'n'또는 'N' 입력시 금액을 입력받지 않고 메뉴로 돌아감  

package view;

import Main.Main;
import service.*;
import util.InputUtil;

import java.util.Scanner;

public class UserMenu {

    private final UserService userService;
    private final DeckService deckService;
    private final CardService cardService;
    private final StudyService studyService;
    private final TestDetailService testDetailService;

    public UserMenu(UserService userService, DeckService deckService, CardService cardService, StudyService studyService, TestService testService, TestDetailService testDetailService) {
        this.userService = userService;
        this.deckService = deckService;
        this.cardService = cardService;
        this.studyService = studyService;
        this.testDetailService = testDetailService;
    }

    public void menu() {
        while (true) {
            System.out.println("-------PHẦN MỀM HỌC TỪ VỰNG TIẾNG NHẬT-------");
            System.out.println("1. Quản lý thông tin tài khoản");
            System.out.println("2. Học cùng thẻ học chung");
            System.out.println("3. Quản lý thẻ học cá nhân");
            System.out.println("4. Tra từ vựng theo từ");
            System.out.println("5. Test");
            System.out.println("6. Thống kê kết quả học tập");
            System.out.println("7. Thoát");
            int choice = InputUtil.chooseOption("Xin mời chọn chức năng",
                    "Chức năng là số dương từ 1 tới 7, vui lòng nhập lại: ", 1, 7);
            switch (choice) {
                case 1:
                    userService.updateUserInformation(Main.LOGGED_IN_USER.getId());
                    break;
                case 2:
                    studyWithCard();
                    break;
                case 3:
                    PersonalCardManagementMenu();
                    break;
                case 4:
                    cardService.findCardByWord();
                    break;
                case 5:
                    testDetailService.takeTest();
                    break;
                case 6:
                    System.out.println("Nhập ID người dùng cần tìm kiếm kết quả: ");
                    int userId = new Scanner(System.in).nextInt();
                    testDetailService.testResultsByUserId(userId);
                    break;
                case 7:
                    return;
            }
        }
    }


    private void PersonalCardManagementMenu() {
        while (true) {
            System.out.println("------------------- PHẦN MỀM HỌC TỪ VỰNG TIẾNG NHẬT-------------------");
            System.out.println("-----------------------QUẢN LÝ THẺ HỌC CÁ NHÂN -----------------------");
            System.out.println("1. Tạo bộ thẻ cá nhân");
            System.out.println("2. Cập nhật thông tin bộ thẻ ");
            System.out.println("3. Xóa bộ thẻ");
            System.out.println("4. Tạo thẻ học cá nhân");
            System.out.println("5. Cập nhật thông tin thẻ học ");
            System.out.println("6. Xóa bộ thẻ");
            System.out.println("7. Học cùng thẻ học cá nhân");
            System.out.println("8. Thoát  ");
            int choice = InputUtil.chooseOption("Xin mời chọn chức năng",
                    "Chức năng là số dương từ 1 tới 8, vui lòng nhập lại: ", 1, 8);
            switch (choice) {
                case 1:
                    deckService.createDeck();
                    break;
                case 2:
                    deckService.updateDeckById();
                    break;
                case 3:
                    deckService.deleteDeckById(Main.LOGGED_IN_USER.getId());
                    break;
                case 4:
                    cardService.createCard();
                    break;
                case 5:
                    cardService.updateCardInfo();
                    break;
                case 6:
                    cardService.deleteCardById(Main.LOGGED_IN_USER.getId());
                    break;
                case 7:
                    studyService.studyWithPersonalCards();
                    break;
                case 8:
                    break;
            }
        }
    }


    private void studyWithCard() {
        while (true) {
            System.out.println("------------------- PHẦN MỀM HỌC TỪ VỰNG TIẾNG NHẬT-------------------");
            System.out.println("-----------------------DANH SÁCH THẺ HỌC -----------------------");
            System.out.println("1. Danh sách thẻ học chung");
            System.out.println("2. Danh sách thẻ đã học");
            System.out.println("3. Danh sách thẻ chưa học");
            System.out.println("4. Thoát");
            int choice = InputUtil.chooseOption("Xin mời chọn chức năng",
                    "Chức năng là số dương từ 1 tới 4, vui lòng nhập lại: ", 1, 4);
            switch (choice) {
                case 1:
                    studyService.studyWithPublicCards();
                    break;
                case 2:
                    studyService.studiedCards();
                    break;
                case 3:
                    studyService.IncomingCards();
                    break;
                case 4:
                    return;
            }
        }
    }
}

package use_case.logout;

import entity.User;
import use_case.login.LoginOutputData;

public class LogoutInteractor implements LogoutInputBoundary {
    final LogoutUserDataAccessInterface userDataAccessObject;
    final LogoutOutputBoundary logoutPresenter;

    public LogoutInteractor(LogoutUserDataAccessInterface userDataAccessInterface,
                           LogoutOutputBoundary logoutOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.logoutPresenter = logoutOutputBoundary;
    }
    @Override
    public void execute() {
       // String loggedoutUser = userDataAccessObject.get(loginInputData.getUsername());
        LogoutOutputData logoutOutputData = new LogoutOutputData();
        logoutPresenter.prepareSuccessView(logoutOutputData);
    }
}

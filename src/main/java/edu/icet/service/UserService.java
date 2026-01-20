package edu.icet.service;

import edu.icet.dto.Response;
import edu.icet.dto.UserDTO;

public interface UserService {
    Response updateOwnAccount(UserDTO userDTO);
    Response getAllUsers();
    Response deleteOwnAccount();
    Response getOwnAccountDetails();
    Response getMyBookingHistory();
}

package edu.icet.service.impl;

import edu.icet.dto.Response;
import edu.icet.dto.UserDTO;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public Response updateOwnAccount(UserDTO userDTO) {
        return null;
    }

    @Override
    public Response getAllUsers() {
        return null;
    }

    @Override
    public Response deleteOwnAccount() {
        return null;
    }

    @Override
    public Response getOwnAccountDetails() {
        return null;
    }

    @Override
    public Response getMyBookingHistory() {
        return null;
    }
}

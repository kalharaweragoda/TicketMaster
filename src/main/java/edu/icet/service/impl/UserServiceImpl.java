package edu.icet.service.impl;

import edu.icet.dto.Response;
import edu.icet.dto.UserDTO;
import edu.icet.repository.BookingRepository;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final BookingRepository bookingRepository;

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

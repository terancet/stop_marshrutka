package backend.service.mappers;

import backend.model.dto.UserInformationDto;
import backend.model.entities.UserInformation;
import org.springframework.stereotype.Service;

@Service
public class UserInformationMapper {

    public UserInformation toUserInformation(UserInformationDto userInformationDto) {
        UserInformation userInformation = new UserInformation();
        userInformation.setEmail(userInformationDto.getEmail());
        userInformation.setTelephoneNumber(userInformationDto.getTelephoneNumber());
        userInformation.setLogin(userInformationDto.getLogin());
        userInformation.setPassword(userInformationDto.getPassword());
        userInformation.setName(userInformationDto.getName());
        userInformation.setSurname(userInformationDto.getSurname());
        return userInformation;
    }

    public UserInformationDto toUserInformationDto( UserInformation userInformation) {
        UserInformationDto userInformationDto = new UserInformationDto();

        userInformationDto.setEmail(userInformation.getEmail());
        userInformationDto.setLogin(userInformation.getLogin());
        userInformationDto.setSurname(userInformation.getSurname());
        userInformationDto.setTelephoneNumber(userInformation.getTelephoneNumber());

        return userInformationDto;
    }
}

package com.spring.application.service;

import com.spring.application.constants.EazySchoolConstants;
import com.spring.application.model.Contact;
import com.spring.application.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service

public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    /**
     * Save Contact Details into DB
     * @param contact
     * @return boolean
     */
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = false;
        contact.setStatus(EazySchoolConstants.OPEN);
        Contact savedContact = contactRepository.save(contact);
        if(null != savedContact && savedContact.getContactId()>0) {
            isSaved = true;
        }
        return isSaved;
    }

    // public List<Contact> findMsgsWithOpenStatus(){
    //     List<Contact> contactMsgs = contactRepository.findByStatus(EazySchoolConstants.OPEN);
    //     return contactMsgs;
    // }

    public boolean updateMsgStatus(int contactId){
        boolean isUpdated = false;
       int rows = contactRepository.updateMsgStatusNative(EazySchoolConstants.CLOSE, contactId);
        if(rows>0) {
            isUpdated = true;
        }
        return isUpdated;
    }

    public Page<Contact> findMsgsWithOpenStatus(int pageNum,String sortField, String sortDir){
        int pageSize = 5;
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize,
                sortDir.equals("asc") ? Sort.by(sortField).ascending()
                        : Sort.by(sortField).descending());
        Page<Contact> msgPage = contactRepository.findOpenMsgsNative(
                EazySchoolConstants.OPEN,pageable);
        return msgPage;
    }


}

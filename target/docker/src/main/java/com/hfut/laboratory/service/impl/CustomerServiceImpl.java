package com.hfut.laboratory.service.impl;

import com.hfut.laboratory.pojo.Customer;
import com.hfut.laboratory.mapper.CustomerMapper;
import com.hfut.laboratory.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yzx
 * @since 2019-11-10
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}

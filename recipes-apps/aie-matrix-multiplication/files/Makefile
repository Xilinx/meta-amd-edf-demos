APP= aie-matrix-multiplication

APPOBJS 	= $(APP).o
CXXFLAGS 	+= -D__AIE_ARCH__=$(__AIE_ARCH__) -D__BOARD__=$(__BOARD__)
LDLIBS          := -lgcc -lc -lxrt_coreutil -lpthread -lrt -ldl -lcrypt -lstdc++

all: $(APP)

$(APP): $(APPOBJS)
	@echo "*************************************************************"
	@echo "-------------$(__AIE_ARCH__)--------------------------------------"
	@echo "/////////////////////////////////////////////////////////////"
	$(CXX) -o $@ $(APPOBJS) $(CXXFLAGS) $(LDFLAGS) $(LDLIBS)

clean:
	-rm -f $(APP) *.o
